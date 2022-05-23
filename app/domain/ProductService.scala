package domain

import model.request.ProductRequest
import model.response.ProductResponse

trait ProductService {
  def create(product: ProductRequest): ProductResponse
}
