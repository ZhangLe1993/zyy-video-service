import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Index from '../views/Index.vue'
import AudioGet from '../views/AudioGet.vue'

Vue.use(VueRouter)

  const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
    {
      path: '/index',
      name: 'Index',
      component: Index,
      meta:  {title: '青汤文化影视网 - 一个专注于古风音乐的网站'},
    },
    {
      path: '/audio/extract',
      name: 'AudioGet',
      component: AudioGet,
      meta:  {title: '青汤文化影视网-音频提取'},
    },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
