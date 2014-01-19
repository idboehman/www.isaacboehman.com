{:title "Index"}

[:div.col-md-8
 [:div.tab-content
  ; about tab
  [:div {:class "tab-pane active" :id "about"}
   [:h3 "Isaac Boehman"]
   ;[:h5 "Title"]
   [:hr]
   ;[:p "Lorem Ipsum is simply dummy text of the printing and typsetting industry."]
   [:p.sm 
    "3rd-year undergrad at Northeastern University working towards a combined "
    "Bachelors of Science in Computer and Information Science."]]
  ; contact tab
  [:div {:class "tab-pane" :id "contact"}
   [:h4 "Contact Information"]
   [:hr]
   [:div.row
    [:div.col-xs-6
     [:p.sm
      [:i.icon-linkedin.icon-2x] " - " [:a {:href "https://www.linkedin.com/in/idboehman/"} "idboehman "] [:br]
      [:i.icon-globe.icon-2x] " - " [:a {:href "http://yacn.me"} "www.yacn.me "]]]
    [:div.col-xs-6
     [:p.sm
      ;[:i.icon-envelope] " - isaac@isaacboehman.com " [:br]
      [:i.icon-github.icon-2x] " - " [:a {:href "https://github.com/yacn"} "@yacn"] [:br]
      [:i.icon-twitter.icon-2x] " - " [:a {:href "https://twitter.com/yaclevername"} "@yaclevername"]]]]]]]
