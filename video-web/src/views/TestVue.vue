<template>
<div>
  <div v-if="visible">
    来隐藏我啊(1)
  </div>
  <div v-if="visibleObj.show">
    来隐藏我啊(2)
  </div>
  <el-button type="primary" @click="show()">显示</el-button>
  <el-button type="primary" @click="hide()">隐藏</el-button>
</div>
</template>

<script>
import Vue from 'vue'
export default {
  name: "TestVue",
  data() {
    return {
      visible: true,
      visibleObj: { show: true }
    }
  },
  methods: {
    show() {
      // 非 Object 类似直接修改Vue可以检测到
      this.visible = true;

      Vue.set(this.visibleObj, "show", true);
    },
    hide() {
      // 非 Object 类似直接修改Vue可以检测到
      this.visible = false;

      // 错误示例
      // 直接修改不会重新渲染页面
      // this.visibleObj['show'] = false;
      // this.visibleObj.show = false;

      // 正确示例

      // 方法一
      this.visibleObj['show'] = false;
      this.$forceUpdate();

      // 方法二 Vue.set(object,key,value)
      Vue.set(this.visibleObj, "show", false);

      // 方法三 this.$set(this.object, key, value)
      this.$set(this.visibleObj, "show", false);

      // 方法四 Object.assign({}, this.object)
      this.visibleObj['show'] = false;
      this.visibleObj = Object.assign({}, this.visibleObj);
      // 或者
      this.visibleObj = Object.assign({}, this.visibleObj,{ show : false });

      // 如果想删除 属性的话
      // 语法: this.$delete(obj, key);
      // this.$delete(this.visibleObj, show);

    }
  }
}
</script>

<style scoped>

</style>