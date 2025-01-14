package logicApplication.cartDAO;


import model.book.ItemBook;
import model.clothes.ItemClothes;
import model.electronics.ItemElectronic;
import model.order.Payment;
import model.shoes.ItemShoes;

public interface CartDAO {
	public void addElectronicsItemToCart(ItemElectronic electronicsItem);
	public void addBookItemToCart(ItemBook itemBook, int quantity);
	public void addShoesItemToCart(ItemShoes shoesItem);
	public void addClothesItemToCart(ItemClothes clothesItem);
	public void getPayment(Payment payment);
}
