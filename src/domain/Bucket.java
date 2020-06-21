package domain;

import java.util.Date;

public class Bucket {
<<<<<<< HEAD
<<<<<<< HEAD
	private Integer id;
	private Integer userId;
	private Integer productId;
	private Date purchaseDate;

	public Bucket(Integer id, Integer userId, Integer productId, Date purchaseDate) {
		this.id = id;
		this.userId = userId;
		this.productId = productId;
		this.purchaseDate = purchaseDate;
	}

	public Bucket(Integer userId, Integer productId, Date purchaseDate) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.purchaseDate = purchaseDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((purchaseDate == null) ? 0 : purchaseDate.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bucket other = (Bucket) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (purchaseDate == null) {
			if (other.purchaseDate != null)
				return false;
		} else if (!purchaseDate.equals(other.purchaseDate))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bucket [id=" + id + ", userId=" + userId + ", productId=" + productId + ", purchaseDate=" + purchaseDate
				+ "]";
	}

=======
=======
>>>>>>> e708fbc78046e666d9fca27a5ab4199925875ce8
	
	private int id;
	private int userId;
	private int magazineId;
	private Date purchaseDate;
	
	public Bucket(int id, int userId, int magazineId, Date purchaseDate) {
		this.id = id;
		this.userId = userId;
		this.magazineId = magazineId;
		this.purchaseDate = purchaseDate;
	}

	public Bucket(int userId, int magazineId, Date purchaseDate) {
		this.userId = userId;
		this.magazineId = magazineId;
		this.purchaseDate = purchaseDate;
	}

	public int getId() {
		return id;
	}

	public int getUserId() {
		return userId;
	}

	public int getMagazineId() {
		return magazineId;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Bucket [id=" + id + ", userId=" + userId + ", magazineId=" + magazineId + ", purchaseDate="
				+ purchaseDate + "]";
	}
	
	
	
<<<<<<< HEAD
>>>>>>> branch 'project-1-jsp-servlets-jdbc' of https://github.com/KVova/Java_Advanced_11-new.git
=======
>>>>>>> e708fbc78046e666d9fca27a5ab4199925875ce8
}
