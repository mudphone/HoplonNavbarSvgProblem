(ns app.main
  (:require [cljsjs.bootstrap]
            [cljsjs.jquery]
            [hoplon.core :refer [defelem nav div button span a ul li]]
            [hoplon.svg :as svg])) ;; <-- Comment & navbar collapse button will work

(defelem form-nav
  [_ _]
  (nav :class "navbar navbar-default"
    (div :class "container-fluid"
      (div :class "navbar-header"
        (button :type "button" :class "navbar-toggle collapsed"
          :data-toggle "collapse" :data-target "#bs-example-navbar-collapse-1" :aria-expanded "false"
          (span :class "icon-bar")
          (span :class "icon-bar")
          (span :class "icon-bar"))

        (a :class "navbar-brand" "Brand"))
      (div :class "collapse navbar-collapse" :id "bs-example-navbar-collapse-1"
        (ul :class "nav navbar-nav"
          (li :class "active" (a :href "#" "Link"))
          (li (a :href "#" "Link"))
          (li :class "dropdown"
            (a :href "#" :class "dropdown-toggle" :data-toggle "dropdown" :role "button" :aria-haspopup "true" :aria-expanded "false" "Dropdown" (span :class "caret"))
            (ul :class "dropdown-menu"
              (li (a :href "#" "Action"))
              (li (a :href "#" "Action2"))
              (li (a :href "#" "Action3")))))))))

(js/jQuery #(-> (js/jQuery "#mountpoint")
                .empty
                (.append (form-nav))))
