import Vue from 'vue'
import VueRouter from 'vue-router'
import Index from '../views/Index.vue'
import AccountIndex from '../views/AccountIndex.vue'
import TestVue from "@/views/TestVue";

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
      path: '/account/index',
      name: 'AccountIndex',
      component: AccountIndex,
      meta:  { title: '沐婉清文化影视网 - 创作者服务平台' },
    },
    {
      path: '/test',
      name: 'TestVue',
      component: TestVue,
      meta:  { title: '测试页面' },
    },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
