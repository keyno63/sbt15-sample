package jp.co.keyno.sample

class SampleService {

  def getMessage(value: Option[String]) = {
    value match {
      case Some(x) if x.isBlank => "nothing"
      case Some(x) if !x.isBlank => s"some value is $x"
      case _ => "unknown"
    }
  }
}
