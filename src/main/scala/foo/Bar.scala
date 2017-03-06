package foo

import java.time.Instant

import com.trueaccord.scalapb.TypeMapper

case class Bar(instant: Instant)

object TypeMappers {
  implicit val instant: TypeMapper[Long, Instant] =
    TypeMapper[Long, Instant](Instant.ofEpochMilli)(_.toEpochMilli)
}