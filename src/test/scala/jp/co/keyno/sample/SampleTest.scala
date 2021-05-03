package jp.co.keyno.sample

import org.mockito.ArgumentMatchers.{any, anyString, eq}
import org.scalatest.flatspec._
import org.mockito.Mockito.{doReturn, mock}

class SampleTest extends AnyFlatSpec {

  val ssMock = mock(classOf[SampleService])
  doReturn("anyValue").when(ssMock).getMessage(Some("value"))
  doReturn("nothing").when(ssMock).getMessage(None)

  val target = new Sample(ssMock)

  "sample" should "anyValue" in {
    assert(target.getMessage(Some("value")) == "anyValue")
  }

  "none" should "nothing" in {
    assert(target.getMessage(None) == "nothing")
  }
}
