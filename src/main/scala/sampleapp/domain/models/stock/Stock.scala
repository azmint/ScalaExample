package sampleapp.domain.models.stock

case class Stock(id: StockId, place: Place, state: State) {
  def replace(newPlace: Place): Stock = copy(place = newPlace)
}

object Stock {
  def normal(id: StockId, place: Place): Stock = Stock(id, place, NormalState())
}
