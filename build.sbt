ThisBuild / scalaVersion := "3.3.1"
ThisBuild / organization := "com.example"

lazy val hello = (project in file("scalaHelloWorld"))
  .settings(
    name := "Hello"
  )