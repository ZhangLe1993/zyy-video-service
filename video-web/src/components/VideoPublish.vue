<template>
  <el-card style="height: calc(100% - 9px); overflow: auto;">
    <div style="width:100%; ">
      <div class="follow-title">发布视频</div>
    </div>
    <div style="width:100%;">
      <el-upload
          class="upload-component"
          drag
          action="https://jsonplaceholder.typicode.com/posts/"
          multiple>
        <i class="el-icon-upload"></i>
        <div class="el-upload__text"><em class="hz">点击上传</em> <span class="hz">或直接将视频文件拖入此区域</span> <br><span class="xiaozi">为了更好的观看体验，超过40秒的视频建议上传横版视频</span></div>
      </el-upload>

      <div class="info--qElns">
        <div class="info-item--1S8MG">
          <p class="title--1cW8N">视频格式</p>
          <p class="desc--1MyNZ">支持常用视频格式，推荐使用mp4、webm</p>
        </div>
        <div class="info-item--1S8MG">
          <p class="title--1cW8N">视频大小</p>
          <p class="desc--1MyNZ">视频文件大小不超过4G，时长在15分钟以内</p>
        </div>
        <div class="info-item--1S8MG">
          <p class="title--1cW8N">视频分辨率</p>
          <p class="desc--1MyNZ">分辨率为720p（1280x720）及以上</p>
        </div>
      </div>
    </div>
  </el-card>
</template>

<script>
export default {
  name: "VideoPublish"
}
</script>

<style scoped>
.follow-title {
  width: 100%;
  margin: 0 auto;
  text-align: left;
  display: inline-block;
  font-style: normal;
  font-weight: normal;
  font-size: 24px;
  line-height: 34px;
  color: rgba(28,31,35,0.9);
  margin-bottom: 16px;
  font-weight: 600;
}
.xiaozi {
  font-size: 10px;
}

.hz {
  font-weight: 700;
}

.info--qElns {
  width: 100%;
  display: flex;
  margin-top: 8px;
}

.info-item--1S8MG {
  flex: 1;
  background: rgba(46,50,56,0.05);
  border-radius: 2px;
  height: 99px;
  flex-direction: column;
  margin-right: 10px;
  align-items: initial;
  padding: 16px;
}

.info-item--1S8MG .title--1cW8N {
  font-style: normal;
  font-weight: normal;
  line-height: 20px;
  font-weight: bold;
  font-size: 14px;
  color: rgba(28,31,35,0.9);
  text-align: left !important;
  margin-bottom: 2px;
}

.info-item--1S8MG .desc--1MyNZ {
  font-style: normal;
  font-weight: normal;
  font-size: 12px;
  line-height: 17px;
  color: rgba(28,31,35,0.55);
  color: rgba(28,31,35,0.55);
  text-align: left !important;
}

</style>

<style>

.upload-component {
  width: 100%;
}

.el-upload {
  width: 100%;
}

.el-upload-dragger {
  width: 100% !important;
  height: 360px !important;
  background-color: rgba(46,50,56,0.05) !important;
}
.el-icon-upload {
  margin-top: 110px;
}

</style>