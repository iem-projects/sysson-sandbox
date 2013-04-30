import sbt._
import Keys._

object Build extends sbt.Build {
  def syssonVersion = "0.2.0"

  lazy val sysson = RootProject(uri("git://github.com/iem-projects/sysson.git#v%s".format(syssonVersion)))

  lazy val root: Project = Project(
    id            = "sysson-sandbox",
    base          = file(".")
  ).dependsOn(sysson)
}
