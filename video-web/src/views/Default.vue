<template>
  <!-- 打算要实现自适应版本, 后面有时间慢慢搞吧. -->
  <el-container>
    <el-main class="main">Main</el-main>
    <el-header>Header</el-header>
  </el-container>
</template>

<script>
// @ is an alias to /src
export default {
  name: 'Default',
  data() {
    return {
      show: 'display:none',
    }
  },
  methods: {
    showHotSearchPanel() {
      this.show = "display:block";
    },
    closeHotSearchPanel() {
      this.show = "display:none";
    },
  },
  components: {
    // eslint-disable-next-line vue/no-unused-components
  },

}
</script>

<style scoped>

body {

  color: #666;
  font-size: 14px;
  font-family: "微软雅黑", Microsoft YaHei, Arial, Verdana;

}

.main {

}

</style>
