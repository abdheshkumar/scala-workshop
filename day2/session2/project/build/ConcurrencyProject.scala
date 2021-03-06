/**
 * Copyright 2011, Derek Chen-Becker
 */

import sbt._

class ConcurrencyProject(info : ProjectInfo) extends DefaultProject(info) {
  val akka_repo = "Akka Maven Repository" at "http://akka.io/repository"
  val jboss_repo = "JBoss Maven Repository" at "http://repository.jboss.org/nexus/content/groups/public/"
  val guiceyfruit_repo = "GuiceyFruit repo" at "http://guiceyfruit.googlecode.com/svn/repo/releases/"

  val akka = "se.scalablesolutions.akka" % "akka-actor" % "1.0"
  val akkaRemote = "se.scalablesolutions.akka" % "akka-remote" % "1.0"
}
