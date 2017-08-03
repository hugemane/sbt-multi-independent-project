package name.hugemane.sbt.core

import org.scalatest.{ FlatSpec, Matchers }

class KnowledgeConfigSpec extends FlatSpec with Matchers with KnowledgeConfig {

  it should "return knowledge website from config" in {
    getKnowledgeWebsite shouldEqual "http://www.test-your-knowledge.com"
  }

  it should "not return incorrect configured value" in {
    getKnowledgeWebsite should not equal "http://www.foxnews.com"
  }
}
