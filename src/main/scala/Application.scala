import config.Loggable
import net.manub.embeddedkafka.{EmbeddedKafka, EmbeddedKafkaConfig}

object Application extends App with Loggable{
  logger.info("Starting embedded Kafka")
  implicit val embeddedKafkaConfig = EmbeddedKafkaConfig(9095, 2185)
  EmbeddedKafka.start()
}
