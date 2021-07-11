<template>
  <el-card style="height: calc(100% - 9px); overflow: auto;">
    <div style="width:100%;text-align: left; ">
      <div class="follow-title">评论管理</div>
      <div class="select-btn"><el-button type="xianh" @click="selectVideo()" size="small">选择视频</el-button></div>
    </div>
    <div class="video-card--Hofzv">
      <div class="container--3ruqW">
        <div class="cover--oOmXq">
          <div>
            <div class="play-btn-container--2fHTx"><img
                src="//sf1-ttcdn-tos.pstatp.com/obj/ies-douyin-opencn/douyin.creator/billboard/icon/play.png"><img
                src="//p9.douyinpic.com/img/tos-cn-p-0015/e3e6a4c44c1c4a69bf9fdb1ce734858e~c5_300x400.jpeg?from=2563711402_large"
                crossorigin="anonymous" class="pic--2Fpfp"></div>
          </div>
          <span class="badge--3_x7K">00:10</span></div>
        <div class="video-info--29Rnc">
          <div class="info-title--xRQzk">
            <div class="info-title-text--kbLgK">别来恨，也是病酒，也是悲秋。#男孩子要努力啊 #加油年轻人</div>
          </div>
          <div class="publish-time--3utY9">发布于2020年10月24日 23:14</div>
        </div>
      </div>
    </div>

    <CommentReply :commentData="commentData"/>

  </el-card>
</template>

<script>
import CommentReply from "@/components/CommentReply";
export default {
  components: {
    CommentReply: CommentReply,
  },
  data() {
    return {
      commentData: [
        { commentId: 'abc001', text: '雀斑女孩，yyds', dateTime: '06月26日 10:19', isAuthor: false, level: 1, replyCount: 0, fan: false, following: true,
          userInfo: {
            avatar: "https://p3.douyinpic.com/img/tos-cn-avt-0015/e7b62c6d69f54fb52246931ae4c81caf~c5_720x720.jpeg?from=4010531038",
            nickname: "肥东olzo女装店",
            userId: "a" }
        },
        { commentId: 'abc002', text: '雀斑女孩，yyds', dateTime: '06月26日 10:19', isAuthor: false, level: 1, replyCount: 1, fan: false, following: true,
          userInfo: {
            avatar: "https://p26.douyinpic.com/img/tos-cn-avt-0015/495ec5cc4c85a35b2ae141f9ef7fca1c~c5_720x720.jpeg?from=4010531038",
            nickname: "TT",
            userId: "b"}
        },
        { commentId: 'abc003', text: '雀斑女孩，yyds', dateTime: '06月26日 10:19', isAuthor: false, level: 1, replyCount: 2, fan: false, following: true,
          userInfo: {
            avatar: "https://p9.douyinpic.com/aweme/720x720/2d59000039ca1688d215d.jpeg?from=4010531038",
            nickname: "冰凌",
            userId: "c"} },
      ],
    }
  },
  name: "CommentManage",
  methods: {
    selectVideo() {

    },
  }
}
</script>

<style scoped>
.follow-title {
  width: 300px;
  margin: 0 auto;
  text-align: left;
  display: inline-block;
  font-style: normal;
  font-weight: normal;
  font-size: 24px;
  line-height: 34px;
  color: rgba(28,31,35,0.9);
  font-weight: 600;
}

.select-btn {
  float:right;display: inline-block;width: calc(100% - 300px);text-align: right;
}

.container--25RtU .video-card--Hofzv {
  margin-top: 24px;
  margin-bottom: 24px;
}

.container--3ruqW {
  background: rgba(22,24,35,0.02);
  border-radius: 4px;
  padding: 20px;
  height: 120px;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
}

.container--3ruqW .cover--oOmXq {
  width: 60px;
  height: 80px;
  display: inline-block;
  position: relative;
  cursor: pointer;
  border-radius: 2px;
  overflow: hidden;
}

.play-btn-container--2fHTx {
  /*width: -webkit-fit-content;*/
  width: -moz-fit-content;
  width: fit-content;
  position: relative;
}

.play-btn-container--2fHTx>img:first-child {
  width: 16px;
  height: auto;
  cursor: pointer;
  position: absolute;
  top: 50%;
  left: 50%;
  -webkit-transform: translate(-50%, -50%);
  -moz-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
}

.container--3ruqW .cover--oOmXq .pic--2Fpfp {
  width: 60px;
  height: 80px;
}

.container--3ruqW .cover--oOmXq .badge--3_x7K {
  display: inline-block;
  position: absolute;
  bottom: 2px;
  right: 2px;
  font-style: normal;
  font-weight: 500;
  font-size: 12px;
  line-height: 12px;
  text-align: center;
  color: #ffffff;
  padding: 4px;
  background: rgba(0,0,0,0.75);
  mix-blend-mode: normal;
  border-radius: 2px;
}

.container--3ruqW .video-info--29Rnc {
  margin-left: 10px;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  -moz-box-orient: vertical;
  -moz-box-direction: normal;
  -ms-flex-direction: column;
  flex-direction: column;
  -moz-box-pack: justify;
  -ms-flex-pack: justify;
  justify-content: space-between;
}

.container--3ruqW .video-info--29Rnc .info-title--xRQzk {
  -moz-box-flex: 1;
  -ms-flex: 1 1;
  flex: 1 1;
}

.container--3ruqW .video-info--29Rnc .info-title-text--kbLgK {
  font-style: normal;
  font-weight: 500;
  font-size: 14px;
  line-height: 26px;
  color: #161823;
  overflow: hidden;
  text-overflow: ellipsis;
  word-break: break-all;
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
}

.container--3ruqW .video-info--29Rnc .publish-time--3utY9 {
  font-style: normal;
  font-weight: normal;
  font-size: 12px;
  line-height: 20px;
  color: #333333;
  mix-blend-mode: normal;
  opacity: 0.4;
}

</style>