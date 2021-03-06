<!DOCTYPE html>
<html>
  <head>
    <style>
       #map {
        height: 200px;
        width: 200px;
       }
    </style>
  </head>
  <body>
    <h3>My Google Maps Demo</h3>
    <div id="map"></div>
    <script>
      function initMap() {
        var uluru = {lat: 10.87771, lng: 106.801687};
        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 16,
          center: uluru
        });
        var marker = new google.maps.Marker({
          position: uluru,
          map: map
        });
      }
    </script>
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCSfDBZibQieX2-z2mM0kfpum2cRCJHnWc&callback=initMap">
    </script>
    
  </body>
</html>