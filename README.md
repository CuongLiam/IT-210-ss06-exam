# 📚 Book Store Internal Management System

## 📌 Giới thiệu

Dự án xây dựng hệ thống quản lý nội bộ Book Store sử dụng **Spring MVC (Jakarta EE)** kết hợp với **Thymeleaf** để hiển thị giao diện động theo mô hình MVC.

Ứng dụng cho phép:

* Xem danh sách sách
* Xem chi tiết từng cuốn sách
* Tái sử dụng giao diện bằng Fragment và Layout

---

## 🛠️ Công nghệ sử dụng

* Java 17+
* Spring MVC 7
* Thymeleaf 3
* Thymeleaf Layout Dialect
* Gradle (WAR packaging)
* Apache Tomcat 10+

---

## 🧱 Cấu trúc dự án

```bash
src/main/java/com/bookstore
 ├── config        # Cấu hình Spring MVC
 ├── controller    # Xử lý request
 ├── service       # Xử lý logic nghiệp vụ
 └── model         # Định nghĩa dữ liệu

src/main/webapp/WEB-INF/templates
 ├── layout        # Layout chính
 ├── fragments     # Header / Footer
 ├── book-list.html
 └── book-detail.html
```

---

## ⚙️ Cài đặt & Chạy dự án

### 1. Clone project

```bash
git clone https://github.com/<your-username>/<repo-name>.git
```

---

### 2. Build project

```bash
./gradlew build
```

---

### 3. Deploy WAR lên Tomcat

* Copy file `.war` vào thư mục:

```bash
tomcat/webapps/
```

* Khởi động Tomcat

---

### 4. Truy cập ứng dụng

```bash
http://localhost:8080/<war-name>/books
```

---

## 🎯 Chức năng chính

### 📖 1. Danh sách sách

* URL: `/books`
* Hiển thị dữ liệu dạng bảng
* Mỗi dòng có link đến trang chi tiết

---

### 🔍 2. Chi tiết sách

* URL: `/books/{id}`
* Hiển thị đầy đủ thông tin sách
* Có nút quay lại danh sách

---

## 🧩 Layout & Fragment

### ✔️ Fragment

* Header và Footer được tách riêng
* Tránh lặp code HTML

### ✔️ Layout Dialect

* Sử dụng `layout:decorate`
* Tái sử dụng khung giao diện

---

## 🚀 Tính năng nâng cao

### 🔹 Fragment có tham số

```html
<div th:replace="fragments/header :: header('Danh sách sách')"></div>
```

---

### 🔹 Highlight sách giá cao

```html
<tr th:classappend="${book.price >= 300000} ? 'highlight'">
```

---

## ⚠️ Lưu ý

* Thư mục view phải đặt tại:

```bash
WEB-INF/templates/
```

* Không sử dụng:

```bash
resources/templates (Spring Boot only)
```

---

## 📊 Đánh giá theo tiêu chí

| Tiêu chí              | Đáp ứng |
| --------------------- | ------- |
| MVC cấu hình đúng     | ✅       |
| Model chuẩn Java Bean | ✅       |
| Controller xử lý đúng | ✅       |
| Fragment & Layout     | ✅       |
| URL động              | ✅       |
| Logic highlight       | ✅       |

---

## 👨‍💻 Tác giả

* Họ tên: [Điền tên bạn]
* Lớp: [Tên lớp]
* Repo: [Link GitHub]

---

## 📌 Ghi chú

Dự án được xây dựng nhằm mục đích học tập và thực hành kiến trúc MVC trong Java Web.

---
