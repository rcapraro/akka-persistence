name := "akka-persistence"

version := "0.1"

scalaVersion := "2.13.6"

lazy val akkaVersion = "2.6.17"
lazy val scalaTestVersion = "3.2.10"
lazy val leveldbVersion = "0.12"
lazy val leveldbjniVersion = "1.8"
lazy val postgresVersion = "42.3.1"
lazy val cassandraVersion = "1.0.5"
lazy val json4sVersion = "3.6.12"
lazy val protobufVersion = "3.19.1"

resolvers += Resolver.jcenterRepo

libraryDependencies ++= Seq(
  "com.typesafe.akka"          %% "akka-persistence" % akkaVersion,

  // local levelDB stores
  "org.iq80.leveldb"            % "leveldb"          % leveldbVersion,
  "org.fusesource.leveldbjni"   % "leveldbjni-all"   % leveldbjniVersion,

  // JDBC with PostgreSQL
  "org.postgresql" % "postgresql" % postgresVersion,
  "com.github.dnvriend" %% "akka-persistence-jdbc" % "3.5.3",

  // Cassandra
  "com.typesafe.akka" %% "akka-persistence-cassandra" % cassandraVersion,
  "com.typesafe.akka" %% "akka-persistence-cassandra-launcher" % cassandraVersion % Test,

  // Google Protocol Buffers
  "com.google.protobuf" % "protobuf-java"  % protobufVersion,

  // Test
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalactic" %% "scalactic" % scalaTestVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion % "test"
)
