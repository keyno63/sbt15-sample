package jp.co.keyno.sample

class Sample(val sampleService: SampleService) {

  def getMessage(value: Option[String]): String =
    sampleService.getMessage(value)
}
