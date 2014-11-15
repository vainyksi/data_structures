package core;

import java.util.Date;

import rb.RBNode;
import rb.RBTree;
import core.data.Product;

public class DateNode extends RBNode<Date> implements NodeValue {
	private Date key;
	private RBTree<Integer> itemsByProductNumber;

	public DateNode(Date key) {
		super();
		this.key = key;
		itemsByProductNumber = new RBTree<>();
	}

	@Override
	public Date getKey() {
		return key;
	}

	public boolean addProduct(Product product) {
		// 1. try to find PN node
		// 2. if does not exist create new PN node
		// 3. add product to node

		boolean retVal = false;

		RBNode<Integer> item = itemsByProductNumber.find(product.getProductNumber());
		if (item == null) {
			ProductNumberNode newItem = new ProductNumberNode(product);
			item = newItem;
		}

		retVal = itemsByProductNumber.insert(item);

		// .... product is already added to PNNode in construktor

		return retVal;
	}

	@Override
	public RBTree<Integer> getNodeValue() {
		return itemsByProductNumber;
	}

	@Override
	public int getSize() {
		// int oldSize = super.getSize();
		return itemsByProductNumber.size();
	}
}
