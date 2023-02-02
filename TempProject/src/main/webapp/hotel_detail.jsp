<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
  let ini = document.querySelector('#modal-window');
  ini.classList.add("hideModal");
</script>

</head>
<body>
<div class="app-container">
  
  
  <section class="app-main">
  <%--객실 리스트 그리드 --%>
    <div class="app-main-left cards-area">
      <div class="card-wrapper main-card">
        <a class="card cardItemjs" onclick="openModal()">
          <div class="card-image-wrapper">
            <img src="https://source.unsplash.com/featured/1200x900/?sculpture,hotel" alt="Hotel">
          </div>
          <div class="card-info">
            <div class="card-text big cardText-js">The Grand Budapest Hotel</div>
            <div class="card-text small">Stockton Street</div>
            <div class="card-text small">
              Starts from:
              <span class="card-price"> $1000</span>
            </div>
          </div>
        </a>
      </div>
      </div>
      <%-- 오른쪽 섹션 --%>
    <div class="app-main-right cards-area">
      <div class="app-main-right-header">
        <span>Latest Deals</span>
        <a href="#">See More</a>
      </div>
      <div class="card-wrapper main-card">
        <a class="card cardItemjs" onclick="openModal()">
          <div class="card-image-wrapper">
            <img src="https://source.unsplash.com/featured/1200x900/?hotel-room,interior">
          </div>
          <div class="card-info">
            <div class="card-text big cardText-js">Hotel Conrad</div>
            <div class="card-text small">Stockton Street</div>
            <div class="card-text small">
              Starts from:
              <span class="card-price"> $1000</span>
            </div>
          </div>
        </a>
      </div>
    </div>
  </section>
</div>
<%--객실 누르면 쉐도우 --%>
<div id="modal-window" class="shadow">
  <div class="main-modal">
    <div class="modal-left">
      <div class="modal-image-wrapper">
        <img src="https://source.unsplash.com/featured/1200x900/?design,hotel">
      </div>
      <div class="modal-info-header">
        <div class="left-side">
          <h1 class="modalHeader-js"></h1>
          <p>Stockton Street</p>
        </div>
        <div class="right-side">
          Starts from:
          <span class="amount">$1000</span>
        </div>
      </div>
      <div class="info-bar">
        <div class="info-wrapper">
          <div class="info-icon">
            <svg class="btn-icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
              <path d="M4 19.5A2.5 2.5 0 0 1 6.5 17H20"></path>
              <path d="M6.5 2H20v20H6.5A2.5 2.5 0 0 1 4 19.5v-15A2.5 2.5 0 0 1 6.5 2z"></path>
            </svg>
          </div>
          <span>2 Bedrooms</span>
        </div>
        <div class="info-wrapper">
          <div class="info-icon">
            <svg class="btn-icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-wind">
              <path d="M9.59 4.59A2 2 0 1 1 11 8H2m10.59 11.41A2 2 0 1 0 14 16H2m15.73-8.27A2.5 2.5 0 1 1 19.5 12H2" />
            </svg>
          </div>
          <span>2 Bathrooms</span>
        </div>
        <div class="info-wrapper">
          <div class="info-icon">
            <svg class="btn-icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-square">
              <rect x="3" y="3" width="18" height="18" rx="2" ry="2" />
            </svg>
          </div>
          <span>1250m2</span>
        </div>
        <div class="info-wrapper">
          <div class="info-icon">
            <svg class="btn-icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-shield">
              <path d="M12 22s8-4 8-10V5l-8-3-8 3v7c0 6 8 10 8 10z" />
            </svg>
          </div>
          <span>Highly Secured</span>
        </div>
      </div>
      <div class="desc-wrapper">
        <div class="modal-info-header">
          <h1>Description</h1>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
          </p>
        </div>
        <div class="desc-actions">
          <button class="btn-book">Book Now</button>
          <div class="add-favourite">
            <input type="checkbox" id="favourite">
            <label for="favourite">
              <span class="favourite-icon">
                <svg class="btn-icon" xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-heart">
                  <path d="M20.84 4.61a5.5 5.5 0 0 0-7.78 0L12 5.67l-1.06-1.06a5.5 5.5 0 0 0-7.78 7.78l1.06 1.06L12 21.23l7.78-7.78 1.06-1.06a5.5 5.5 0 0 0 0-7.78z" />
                </svg>
              </span>
              <span>Add to favourites</span>
            </label>
          </div>
        </div>
      </div>
    </div>
    
    <button class="btn btn-close" onclick="closeM()">
      <svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-x">
        <line x1="18" y1="6" x2="6" y2="18" />
        <line x1="6" y1="6" x2="18" y2="18" />
      </svg>
    </button>
  </div>
</div>

</body>
</html>