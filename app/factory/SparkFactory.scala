package factory

import javax.inject.Singleton
import org.apache.spark.SparkContext
import org.apache.spark.sql.{SQLContext, SparkSession}

@Singleton
object SparkFactory {


  val sparkSession: SparkSession = SparkSession.builder().appName("spark-embedded-session")
    .master("local").getOrCreate()

  def getSparkSession: SparkSession = {
    sparkSession
  }

  def getSparkContext: SparkContext = {
    sparkSession.sparkContext
  }

  def getSQLContext: SQLContext = {
    sparkSession.sqlContext
  }
}
