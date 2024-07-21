import gleam/bytes_builder
import gleam/erlang/process
import gleam/http/response.{Response}
import mist

pub fn main() {
  let assert Ok(_) =
    web_service
    |> mist.new
    |> mist.port(8080)
    |> mist.start_http
  process.sleep_forever()
}

fn web_service(_request) {
  let body = bytes_builder.from_string("Hello not more miwis hahahahah")
  Response(200, [], mist.Bytes(body))
}
