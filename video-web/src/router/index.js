import Vue from 'vue'
import VueRouter from 'vue-router'
import Index from '../views/Index.vue'
import Default from '../views/Default.vue'

Vue.use(VueRouter)

  const routes = [
    {
      path: '/',
      name: 'Index',
      component: Index
    },
    {
      path: '/index',
      name: 'Index',
      component: Index,
      meta:  {title: '沐婉清文化影视网 - 一个专注于古风音乐的网站' },
    },
    {
      path: '/default',
      name: 'Default',
      component: Default,
      meta:  { title: '沐婉清文化影视网 - 一个专注于古风音乐的网站' },
    },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
