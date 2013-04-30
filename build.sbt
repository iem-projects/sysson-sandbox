name := "sysson-sandbox"

version := "0.0.1-SNAPSHOT"

organization := "at.iem.sysson"

description := "Sandbox for playing around with SysSon as a library"

homepage <<= name { n => Some(url("https://github.com/iem-projects/" + n)) }

licenses := Seq("GPL v2+" -> url( "http://www.gnu.org/licenses/gpl-2.0.txt"))

scalaVersion := "2.10.1"

// maven repository for NetCDF library
resolvers += "Unidata Repository" at "https://artifacts.unidata.ucar.edu/content/repositories/unidata-releases"

retrieveManaged := true

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

initialCommands in console :=
  """|import at.iem.sysson._
     |import Implicits._
     |import sandbox._
     |import de.sciss.osc
     |import OSCSupport._""".stripMargin

