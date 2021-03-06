(ns coast
  (:require [potemkin :refer [import-vars]]
            [hiccup2.core]
            [coast.db]
            [coast.eta]
            [coast.env]
            [coast.time]
            [coast.components]
            [coast.responses]
            [coast.utils]
            [coast.error]
            [coast.router]
            [coast.jobs]
            [coast.validation]
            [coast.middleware.site]))

(import-vars
  [coast.responses
   ok
   bad-request
   not-found
   unauthorized
   server-error
   redirect
   flash]

  [coast.error
   raise
   rescue]

  [coast.db
   q
   pull
   transact
   delete
   insert
   update*
   first!]

  [coast.validation
   validate]

  [coast.components
   form
   js
   css]

  [coast.router
   wrap-routes
   prefix-routes]

  [coast.middleware.site
   wrap-layout]

  [coast.eta
   server
   app
   url-for
   action-for]

  [coast.env
   env]

  [coast.jobs
   queue]

  [coast.utils
   uuid]

  [coast.time
   now]

  [hiccup2.core
   raw
   html])
