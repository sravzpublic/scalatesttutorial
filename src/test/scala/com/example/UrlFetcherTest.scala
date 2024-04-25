import org.scalatest.funsuite.AsyncFunSuite
import org.scalatest.matchers.should.Matchers
import sttp.client3._
import scala.concurrent.Future
import sttp.client3.testing.SttpBackendStub
import sttp.model.StatusCode
import sttp.client3.asynchttpclient.future.AsyncHttpClientFutureBackend

class UrlFetcherTests extends AsyncFunSuite with Matchers {
  ignore(
    "fetchUrl should return the expected content when the request succeeds"
  ) {
    val expectedResponse = "Hello, world!"
    val mockBackend = SttpBackendStub.synchronous
      .whenRequestMatches(_.uri.toString == "https://example.com")
      .thenRespond(expectedResponse)

    implicit val backend: SttpBackend[Future, Any] =
      AsyncHttpClientFutureBackend()

    // implicit val backend = mockBackend

    val fetcher = new {
      def fetchUrl(url: String)(implicit
          backend: SttpBackend[Future, Any]
      ): Future[String] = {
        val request = basicRequest.get(uri"$url")
        request.send().map(_.body.getOrElse("Error"))
      }
    }

    fetcher.fetchUrl("https://example.com").map { result =>
      result shouldEqual expectedResponse
    }
  }

  ignore("fetchUrl should return 'Error' when the request fails") {
    val mockBackend = SttpBackendStub.synchronous
      .whenRequestMatches(_.uri.toString == "https://example.com")
      .thenRespond(
        Response("Internal server error", StatusCode.InternalServerError)
      )

    val fetcher = new {
      def fetchUrl(url: String)(implicit
          backend: SttpBackend[Future, Any]
      ): Future[String] = {
        val request = basicRequest.get(uri"$url")
        request.send().map(_.body.getOrElse("Error"))
      }
    }

    implicit val backend: SttpBackend[Future, Any] =
      AsyncHttpClientFutureBackend()

    // implicit val backend = mockBackend
    fetcher.fetchUrl("https://example.com").map { result =>
      result shouldEqual "Error"
    }
  }
}
