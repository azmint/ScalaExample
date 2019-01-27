package sampleapp.domain.models

package object stock {

  case class StockId(value: String) {}

  case class Place(value: String) {}

  sealed abstract class State() {}

  case class NormalState() extends State {}

}
