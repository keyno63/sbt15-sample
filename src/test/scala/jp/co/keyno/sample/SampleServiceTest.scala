package jp.co.keyno.sample

import org.scalatest.flatspec._

class SampleServiceTest extends AnyFlatSpec {

  val target = new SampleService

  "sample service get option empty" should "nothing" in  {
    assert(target.getMessage(Some("")) == "nothing")
  }

  "sample service get option value" should "syntax" in  {
    val value = "any one"
    assert(target.getMessage(Some(value)) == s"some value is $value")
  }

  "sample service get option none" should "unknown" in  {
    assert(target.getMessage(None) == "unknown")
  }
}
