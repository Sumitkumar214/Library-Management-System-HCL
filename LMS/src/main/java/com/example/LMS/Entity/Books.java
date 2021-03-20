package com.example.LMS.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookid;
	@NotBlank(message = "title is mandatory")
	private String title;
	@NotBlank(message = "author is mandatory")
	private String author;
	@NotBlank(message = "publisher is mandatory")
	private String publisher;
	private String status;
	@ManyToOne
    @JoinColumn(name="userid", nullable=false)
	private User user;
	private Date borrowdate;
	private Date returndate;
	
	
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getBorrowdate() {
		return borrowdate;
	}
	public void setBorrowdate(Date borrowdate) {
		this.borrowdate = borrowdate;
	}
	public Date getReturndate() {
		return returndate;
	}
	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}
	
	@Override
	public String toString() {
		return "Books [bookid=" + bookid + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", status=" + status + ", user=" + user + ", borrowdate=" + borrowdate + ", returndate=" + returndate
				+ ", getBookid()=" + getBookid() + ", getTitle()=" + getTitle() + ", getAuthor()=" + getAuthor()
				+ ", getPublisher()=" + getPublisher() + ", getStatus()=" + getStatus() + ", getUser()=" + getUser()
				+ ", getBorrowdate()=" + getBorrowdate() + ", getReturndate()=" + getReturndate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Books(Integer bookid, @NotBlank(message = "title is mandatory") String title,
			@NotBlank(message = "author is mandatory") String author,
			@NotBlank(message = "publisher is mandatory") String publisher, String status, User user, Date borrowdate,
			Date returndate) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.status = status;
		this.user = user;
		this.borrowdate = borrowdate;
		this.returndate = returndate;
	}
	
	
	
	

}
