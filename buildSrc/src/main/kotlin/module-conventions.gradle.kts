import fr.brouillard.oss.jgitver.Strategies

plugins { id("fr.brouillard.oss.gradle.jgitver") }

group = "org.maplibre.compose"
version = "0.12.1-kotlin2320"

jgitver {
  strategy(Strategies.MAVEN)
  nonQualifierBranches("main")
}

tasks.withType<AbstractTestTask>().configureEach { failOnNoDiscoveredTests = false }
