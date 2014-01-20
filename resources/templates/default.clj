[:html {:lang "en"}
 [:head
  [:meta {:charset "utf-8"}]
  [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
  [:meta {:name "author" :content "Isaac Boehman"}]
  [:link {:rel "shortcut icon" :href "assets/ico/favicon.png"}]
  [:title "Isaac Boehman"]
  ;[:link {:rel "stylesheet" :href "assets/css/bootstrap.min.css"}]
  [:link {:rel "stylesheet" :type "text/css" :href "//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.3/css/bootstrap.min.css"}]
  [:link {:rel "stylesheet" :href "assets/css/main.css"}]
  [:link {:rel "stylesheet" :type "text/css" :href "//cdnjs.cloudflare.com/ajax/libs/font-awesome/3.2.1/css/font-awesome.min.css"}]
  [:link {:rel "stylesheet" :type "text/css" :href "http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic"}]
  [:link {:rel "stylesheet" :type "text/css" :href "http://fonts.googleapis.com/css?family=Raleway:400,300,700"}]]
 [:body
  [:div.container
   [:div {:class "col-lg-6 col-lg-offset-3"}
    [:div {:class "row w"}
     ; vcard nav
     [:div.col-md-4
      [:img.img-responsive {:src "http://ccs.neu.edu/home/iboehman/avatar.jpg" :alt ""}]
      [:ul {:class "nav nav-tabs nav-stacked" :id "myTab"}
       [:li.active [:a {:href "#about"} "About"]]]]
       ; vCard Content
       content]]]
 [:script {:src "//cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"}]
 [:script {:src "//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.3/js/bootstrap.min.js"}]
 [:script "$('#myTab a').click(function(e){e.preventDefault();$(this).tab('show');})"]]]
