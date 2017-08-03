package name.hugemane.sbt.submodule

import name.hugemane.sbt.submodule.logic.KnowledgeProcessor
import org.scalatest.{ FlatSpec, Matchers }

class KnowledgeProcessorSpec extends FlatSpec with Matchers {

  it should "return website and date time" in {
    val processor = new KnowledgeProcessor()

    val result = processor.processKnowledgeInTime()

    result should startWith("http://www.test-your-knowledge-AGAIN.com")
    result should endWith regex "\\d{2}.\\d{2}.\\d{4} \\d{2}:\\d{2}:\\d{2}"
  }
}
