<template>

  <div>
    <div v-if="visible" style="height: 500px;">
      哈哈哈哈
    </div>
    <el-button type="primary" @click="show()">显示</el-button>
    <el-button type="primary" @click="hide()">隐藏</el-button>
  </div>

</template>

<script>
export default {
  name: "DynamicFunc",
  data() {
    return {
      visible: true,
    }
  },
  mounted() {
    // 测试一下
    this.callModelFun('funcA');
    this.callModelFun('funcB');
  },
  methods: {
    // 直接调用
    show() {
      this.visible = true;
    },
    // 动态调用
    show2() {
      this.callModelFun('funcShow');
    },
    // 直接调用
    hide() {
      this.visible = false;
    },
    hide2() {
      this.callModelFun('funcHide');
    },
    /**
     * 根据方法名称调用方法
     */
    callModelFun(funcName) {
      let methods = this.$options.methods;
      const _this = this;
      methods[funcName](_this);
    },

    /**
     * funcShow
     * @param _this
     */
    funcShow(_this) {
      console.log("调用Show方法")
      _this.visible = true;
    },

    /**
     * funcHide
     * @param _this
     */
    funcHide(_this) {
      console.log("调用Hide方法")
      _this.visible = false;
      // 注意这里不能直接使用 this.visible = false; 不会生效

    }
  }
}
</script>

<style scoped>

</style>