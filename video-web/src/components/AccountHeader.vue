<template>
  <div class="header-wrapper--1ulkm">
    <div class="wapper">
      <div class="header--title">沐婉清 创作者平台</div>
      <el-avatar> user </el-avatar>
    </div>
  </div>
</template>

<script>
export default {
  name: "AccountHeader"
}
</script>

<style scoped>

.header-wrapper--1ulkm {
  height: 80px;
  background: #fff;
  -webkit-box-shadow: 0 4px 12px rgba(42,50,58,0.03);
  box-shadow: 0 4px 12px rgba(42,50,58,0.03);
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;

  z-index: 2;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
}

.wapper {
  font-size: large;
  width: 1230px;
  display: flex;
  margin: auto;
  align-items: center;
  padding: 0 50px;
  justify-content: space-between;
}

.header--title {

}

</style>