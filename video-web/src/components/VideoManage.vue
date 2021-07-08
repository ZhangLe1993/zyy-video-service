<template>
  <el-card class="box-card" style="height: calc(100% - 9px);">
    <div style="text-align: left;">
      <el-button type="danger" style="margin-right: 15px;"> 全部作品</el-button>
      <el-divider direction="vertical"></el-divider>
      <el-button type="danger" style="margin-left: 15px;margin-right: 15px;"> 已发布</el-button>
      <el-divider direction="vertical"></el-divider>
      <el-button type="danger" style="margin-left: 15px;"> 审核中</el-button>
      <el-divider direction="vertical"></el-divider>
      <el-button type="danger" style="margin-left: 15px;"> 未通过</el-button>
    </div>
    <el-divider></el-divider>
    <div class="infinite-list-wrapper" style="overflow:auto;height: calc(100vh - 140px);background: #f4f5f5;">
      <ul
          class="list"
          v-infinite-scroll="load"
          infinite-scroll-disabled="disabled">
        <li v-for="i in count" class="list-item" :key="i">{{ i }}</li>
      </ul>
      <p v-if="loading">加载中...</p>
      <p v-if="noMore">没有更多了</p>
    </div>
  </el-card>
</template>

<script>
export default {
  name: "VideoManage",
  data() {
    return {
      count: 4,
      loading: false
    }
  },
  computed: {
    noMore () {
      return this.count >= 20
    },
    disabled () {
      return this.loading || this.noMore
    }
  },
  methods: {
    handleNodeClick(data) {
      console.log(data);
    },
    load () {
      this.loading = true
      setTimeout(() => {
        this.count += 2
        this.loading = false
      }, 2000)
    }
  }
}
</script>

<style scoped>
.list-item {
  list-style-type:none;
  display: block;
  width: 100%;
  height: 200px;
  background: #fff;
  margin-bottom: 10px;
}
</style>