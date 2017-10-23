package com.mckinsey.attributionlist

import java.sql.DriverManager
import java.sql.Connection

object ScalaJdbcConnectSelect {

  def main(args: Array[String]) {

    val driver = "org.apache.hive.jdbc.HiveDriver"
    val url = "jdbc:hive2://hivehost:443/;ssl=true;sslTrustStore=/ssh-dev/cacerts;trustStorePassword=changeit;transportMode=http;httpPath=gateway/default/hive"
    val username = "username"
    val password = "password"

    // there's probably a better way to do this
    var connection:Connection = null

    try {
      // make the connection
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)
      println("Connected >>>>>>>>>>>>>>>>")
      
    } catch {
      case e => e.printStackTrace
    }
    //connection.close()
  }
}