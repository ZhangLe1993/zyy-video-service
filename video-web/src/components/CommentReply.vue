<template>
  <div class="cmt-detail--1CVzS">
    <h3 class="cmt-title--32XL-">评论列表</h3>
    <ul class="cmt-ul--2wBky">
      <li class="cmt-li--1ncVr" v-for="item in commentData" :key="item.commentId">
        <div class="cmt-item--2D1l_">
          <!-- 头像 -->
          <div class="cmt-avatar--K05gm"
               :style="'background-image: url(' + item.userInfo.avatar + '), url(data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KPHN2ZyB3aWR0aD0iOTZweCIgaGVpZ2h0PSI5NnB4IiB2aWV3Qm94PSIwIDAgOTYgOTYiIHZlcnNpb249IjEuMSIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIiB4bWxuczp4bGluaz0iaHR0cDovL3d3dy53My5vcmcvMTk5OS94bGluayI+CiAgICA8IS0tIEdlbmVyYXRvcjogU2tldGNoIDU5LjEgKDg2MTQ0KSAtIGh0dHBzOi8vc2tldGNoLmNvbSAtLT4KICAgIDx0aXRsZT5Hcm91cCA2MDU8L3RpdGxlPgogICAgPGRlc2M+Q3JlYXRlZCB3aXRoIFNrZXRjaC48L2Rlc2M+CiAgICA8ZyBpZD0iUGFnZS0xIiBzdHJva2U9Im5vbmUiIHN0cm9rZS13aWR0aD0iMSIgZmlsbD0ibm9uZSIgZmlsbC1ydWxlPSJldmVub2RkIj4KICAgICAgICA8ZyBpZD0iR3JvdXAtNjA1IiBmaWxsPSIjMTYxODIzIj4KICAgICAgICAgICAgPHBhdGggZD0iTTQ4LDk2IEM3NC41MSw5NiA5Niw3NC41MDk3IDk2LDQ4IEM5NiwyMS40OTAzIDc0LjUxLDAgNDgsMCBDMjEuNDkwMywwIDAsMjEuNDkwMyAwLDQ4IEMwLDc0LjUwOTcgMjEuNDkwMyw5NiA0OCw5NiBaIiBpZD0iUGF0aCIgZmlsbC1vcGFjaXR5PSIwLjA2Ij48L3BhdGg+CiAgICAgICAgICAgIDxjaXJjbGUgaWQ9Ik92YWwiIGZpbGwtb3BhY2l0eT0iMC4xIiBmaWxsLXJ1bGU9Im5vbnplcm8iIGN4PSI0OCIgY3k9IjQwIiByPSIxNyI+PC9jaXJjbGU+CiAgICAgICAgICAgIDxwYXRoIGQ9Ik04Mi4yOTEsNzcuMTQxMyBDNzQuMDM2LDg2Ljg0NDUgNjEuNzM3LDkzIDQ3Ljk5OTYsOTMgQzM1LjQxNjksOTMgMjQuMDQwNCw4Ny44MzU3IDE1Ljg3NCw3OS41MTEgQzIzLjQ5NzYsNjguOTA2MyAzNS45NDIxLDYyIDQ5Ljk5OTYsNjIgQzYyLjk4MSw2MiA3NC41ODYsNjcuODg5MSA4Mi4yOTEsNzcuMTQxMyBaIiBpZD0iUGF0aCIgZmlsbC1vcGFjaXR5PSIwLjEiPjwvcGF0aD4KICAgICAgICA8L2c+CiAgICA8L2c+Cjwvc3ZnPg==); background-size: cover;'"></div>
          <!--昵称+日期+评论-->
          <div class="cmt-content--1rC9R">
            <h4 class="cmt-name--C-CRF">{{ item.userInfo.nickname }}
              <span class="cmt-label--3epN8" v-if="!item.isAuthor && item.fan && !item.following" >关注你的人</span>
              <span class="cmt-label--3epN8" v-if="!item.isAuthor && !item.fan && item.following" >你关注的人</span>
              <span class="cmt-label--3epN8" v-if="!item.isAuthor && item.fan && item.following" >好友</span>
              <span v-if="item.isAuthor" class="cmt-label--3epN8 red--1p5xw">作者</span>
            </h4>
            <p class="cmt-time--1eLnF">{{ item.dateTime }}</p>
            <pre class="cmt-text--2uo7G">{{ item.text }}</pre>
            <div class="cmt-icons--1rKXh">
                <span class="">
                  <svg width="14" height="14" viewBox="0 0 14 14" fill="none">
                    <path fill-rule="evenodd" clip-rule="evenodd" d="M9.542 1.75c-.99 0-1.892.395-2.44 1.142-.753-.747-1.655-1.142-2.644-1.142C2.569 1.75 1 3.314 1 5.175c0 .126.006.184 0 .19.01.429.222 1.202.392 1.527 1.144 2.365 4.758 4.87 4.928 5.033.17.163.34.325.68.325s.51-.162.68-.325c.17-.162 3.329-2.442 4.71-4.658.06-.151.1-.226.203-.38.066-.16.132-.304.204-.38.125-.428.196-.751.203-1.142-.005-.011 0-.065 0-.19 0-1.86-1.57-3.425-3.458-3.425z" fill="#1C1F23" fill-opacity="0.3"></path>
                  </svg>
                  0
                </span>
              <span>
                  <svg width="14" height="14" viewBox="0 0 14 14" fill="none">
                    <path fill-rule="evenodd" clip-rule="evenodd" d="M11.32 10.42c1.25-1.26 1.98-2.574 1.98-4.103C13.3 3.215 10.48.7 7 .7S.7 3.215.7 6.317C.7 9.42 3.61 11.55 7.09 11.55v.932c0 .37.384.607.708.429.907-.5 2.484-1.445 3.52-2.491zM7.93 6.425a.944.944 0 11-1.889 0 .944.944 0 011.889 0zm-3.912.945a.944.944 0 100-1.889.944.944 0 000 1.889zm6.88-.945a.944.944 0 11-1.889 0 .944.944 0 011.89 0z" fill="#1C1F23" fill-opacity="0.3"></path>
                  </svg>回复
                </span>
              <span>
                  <svg width="14" height="14" viewBox="0 0 14 14" fill="none">
                    <g opacity="0.3" fill="#1C1F23">
                      <path d="M11.5 2.2h-9a1 1 0 000 2h9a1 1 0 100-2z"></path>
                    <path d="M9.5 1.2h-5a1 1 0 000 2h5a1 1 0 100-2z"></path>
                    <path fill-rule="evenodd" clip-rule="evenodd" d="M11.383 5l-.683 7.286a.788.788 0 01-.786.714H4.086a.788.788 0 01-.786-.714L2.617 5h8.766z"></path>
                  </g>
                  </svg>
                  删除
                </span>
            </div>
          </div>
          <div class="cmt-reply--1KIry">
            <ul class="cmt-ul--2wBky sub--bIN9u">

              <li class="cmt-li--1ncVr sub--bIN9u"
                  v-for="replyItem in replyData[item.commentId]"
                  :key="replyItem.commentId">
                <div class="cmt-item--2D1l_ sub--bIN9u">
                  <div class="cmt-avatar--K05gm"
                       :style="'background-image: url(' + replyItem.userInfo.avatar + '), url(data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KPHN2ZyB3aWR0aD0iOTZweCIgaGVpZ2h0PSI5NnB4IiB2aWV3Qm94PSIwIDAgOTYgOTYiIHZlcnNpb249IjEuMSIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIiB4bWxuczp4bGluaz0iaHR0cDovL3d3dy53My5vcmcvMTk5OS94bGluayI+CiAgICA8IS0tIEdlbmVyYXRvcjogU2tldGNoIDU5LjEgKDg2MTQ0KSAtIGh0dHBzOi8vc2tldGNoLmNvbSAtLT4KICAgIDx0aXRsZT5Hcm91cCA2MDU8L3RpdGxlPgogICAgPGRlc2M+Q3JlYXRlZCB3aXRoIFNrZXRjaC48L2Rlc2M+CiAgICA8ZyBpZD0iUGFnZS0xIiBzdHJva2U9Im5vbmUiIHN0cm9rZS13aWR0aD0iMSIgZmlsbD0ibm9uZSIgZmlsbC1ydWxlPSJldmVub2RkIj4KICAgICAgICA8ZyBpZD0iR3JvdXAtNjA1IiBmaWxsPSIjMTYxODIzIj4KICAgICAgICAgICAgPHBhdGggZD0iTTQ4LDk2IEM3NC41MSw5NiA5Niw3NC41MDk3IDk2LDQ4IEM5NiwyMS40OTAzIDc0LjUxLDAgNDgsMCBDMjEuNDkwMywwIDAsMjEuNDkwMyAwLDQ4IEMwLDc0LjUwOTcgMjEuNDkwMyw5NiA0OCw5NiBaIiBpZD0iUGF0aCIgZmlsbC1vcGFjaXR5PSIwLjA2Ij48L3BhdGg+CiAgICAgICAgICAgIDxjaXJjbGUgaWQ9Ik92YWwiIGZpbGwtb3BhY2l0eT0iMC4xIiBmaWxsLXJ1bGU9Im5vbnplcm8iIGN4PSI0OCIgY3k9IjQwIiByPSIxNyI+PC9jaXJjbGU+CiAgICAgICAgICAgIDxwYXRoIGQ9Ik04Mi4yOTEsNzcuMTQxMyBDNzQuMDM2LDg2Ljg0NDUgNjEuNzM3LDkzIDQ3Ljk5OTYsOTMgQzM1LjQxNjksOTMgMjQuMDQwNCw4Ny44MzU3IDE1Ljg3NCw3OS41MTEgQzIzLjQ5NzYsNjguOTA2MyAzNS45NDIxLDYyIDQ5Ljk5OTYsNjIgQzYyLjk4MSw2MiA3NC41ODYsNjcuODg5MSA4Mi4yOTEsNzcuMTQxMyBaIiBpZD0iUGF0aCIgZmlsbC1vcGFjaXR5PSIwLjEiPjwvcGF0aD4KICAgICAgICA8L2c+CiAgICA8L2c+Cjwvc3ZnPg==); background-size: cover;'"></div>
                  <div class="cmt-content--1rC9R">
                    <h4 class="cmt-name--C-CRF"> {{ replyItem.userInfo.nickname }} <span v-if="replyItem.isAuthor" class="cmt-label--3epN8 red--1p5xw">作者</span></h4>
                    <p class="cmt-time--1eLnF">{{ replyItem.dateTime }}</p>
                    <pre class="cmt-text--2uo7G"><span v-if="replyItem.replyToUserInfo != null">回复</span> <em v-if="replyItem.replyToUserInfo != null">{{ replyItem.replyToUserInfo.nickname }}：</em>{{ replyItem.text }}</pre>
                    <div class="cmt-icons--1rKXh">
                        <span class="">
                          <svg width="14" height="14" viewBox="0 0 14 14" fill="none">
                            <path fill-rule="evenodd"
                                  clip-rule="evenodd"
                                  d="M9.542 1.75c-.99 0-1.892.395-2.44 1.142-.753-.747-1.655-1.142-2.644-1.142C2.569 1.75 1 3.314 1 5.175c0 .126.006.184 0 .19.01.429.222 1.202.392 1.527 1.144 2.365 4.758 4.87 4.928 5.033.17.163.34.325.68.325s.51-.162.68-.325c.17-.162 3.329-2.442 4.71-4.658.06-.151.1-.226.203-.38.066-.16.132-.304.204-.38.125-.428.196-.751.203-1.142-.005-.011 0-.065 0-.19 0-1.86-1.57-3.425-3.458-3.425z"
                                  fill="#1C1F23"
                                  fill-opacity="0.3">
                            </path>
                          </svg>0
                        </span>
                      <span>
                          <svg width="14" height="14" viewBox="0 0 14 14" fill="none">
                            <path fill-rule="evenodd"
                                  clip-rule="evenodd"
                                  d="M11.32 10.42c1.25-1.26 1.98-2.574 1.98-4.103C13.3 3.215 10.48.7 7 .7S.7 3.215.7 6.317C.7 9.42 3.61 11.55 7.09 11.55v.932c0 .37.384.607.708.429.907-.5 2.484-1.445 3.52-2.491zM7.93 6.425a.944.944 0 11-1.889 0 .944.944 0 011.889 0zm-3.912.945a.944.944 0 100-1.889.944.944 0 000 1.889zm6.88-.945a.944.944 0 11-1.889 0 .944.944 0 011.89 0z"
                                  fill="#1C1F23"
                                  fill-opacity="0.3">

                            </path>
                          </svg>回复
                        </span>
                      <span>
                          <svg width="14" height="14" viewBox="0 0 14 14" fill="none">
                            <g opacity="0.3" fill="#1C1F23"><path d="M11.5 2.2h-9a1 1 0 000 2h9a1 1 0 100-2z"></path>
                              <path d="M9.5 1.2h-5a1 1 0 000 2h5a1 1 0 100-2z"> </path>
                              <path fill-rule="evenodd" clip-rule="evenodd" d="M11.383 5l-.683 7.286a.788.788 0 01-.786.714H4.086a.788.788 0 01-.786-.714L2.617 5h8.766z"></path>
                            </g>
                          </svg>删除
                        </span>
                    </div>
                  </div>
                </div>
              </li>
            </ul>
            <!-- 展开回复组件 -->
            <div v-if="item.replyCount > 0 && expanded[item.commentId] === 'hide'" class="cmt-expand--16Cbs" @click="expandReplay(item.userInfo.userId, item.commentId)">
              <span></span>展开1条回复
              <svg class="semi-icons semi-icons-chevron_down semi-icons-default" aria-hidden="true">
                <use xlink:href="#semi-icons-chevron_down"></use>
              </svg>
            </div>
            <div v-if="item.replyCount > 0 && expanded[item.commentId] === 'show'" class="cmt-expand--16Cbs"  @click="packUpReplay(item.commentId)">
              <span></span>收起回复
              <svg class="semi-icons semi-icons-chevron_up semi-icons-default" aria-hidden="true">
                <use xlink:href="#semi-icons-chevron_up"></use>
              </svg>
            </div>

          </div>
        </div>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "CommentReply",
  props: {
    commentData: Array,
  },
  created() {
    if(this.commentData !== undefined && this.commentData !== null && this.commentData.length !== 0) {
      const size = this.commentData.length;
      for(let i = 0; i < size; i++) {
        const item = this.commentData[i];
        // this[item.commentId]= "hide";
        // Vue.set(item.commentId, "hide");
        this.$set(this.expanded, item.commentId, "hide");
      }
    }
    console.log(this.expanded);
  },
  data() {
    return {
      replyData: {},
      "abc002": [{ commentId: '3', text: '雀斑女孩，yyds-r', dateTime: '06月26日 10:19', isAuthor: true, level: 2, replyCount: 0, fan: false, following: true,
        userInfo: {
          avatar: "https://p26.douyinpic.com/img/tos-cn-avt-0015/495ec5cc4c85a35b2ae141f9ef7fca1c~c5_720x720.jpeg?from=4010531038",
          nickname: "TT",
          userId: "@jfJo5bRJRU/5t8lc7bvvvtV2pi6QZiH1KaoqO5BdvJ2fBMiNAONHQTF3P1vcw94u"}
      },
        { commentId: '4', text: '雀斑女孩，yyds-r', dateTime: '06月26日 10:19', isAuthor: false, level: 2, replyCount: 0, fan: false, following: true,
          userInfo: {
            avatar: "https://p26.douyinpic.com/img/tos-cn-avt-0015/495ec5cc4c85a35b2ae141f9ef7fca1c~c5_720x720.jpeg?from=4010531038",
            nickname: "TT",
            userId: "@jfJo5bRJRU/5t8lc7bvvvtV2pi6QZiH1KaoqO5BdvJ2fBMiNAONHQTF3P1vcw94u"
          },
          replyToUserInfo: {
            avatar: "https://p26.douyinpic.com/img/tos-cn-avt-0015/495ec5cc4c85a35b2ae141f9ef7fca1c~c5_720x720.jpeg?from=4010531038",
            nickname: "TT",
            userId: "@jfJo5bRJRU/5t8lc7bvvvtV2pi6QZiH1KaoqO5BdvJ2fBMiNAONHQTF3P1vcw94u"
          }
        }],
      "abc003": [{ commentId: '5', text: '雀斑女孩，yyds-r', dateTime: '06月26日 10:19', isAuthor: false, level: 2, replyCount: 0, fan: false, following: true,
        userInfo: {
          avatar: "https://p26.douyinpic.com/img/tos-cn-avt-0015/495ec5cc4c85a35b2ae141f9ef7fca1c~c5_720x720.jpeg?from=4010531038",
          nickname: "TT",
          userId: "@jfJo5bRJRU/5t8lc7bvvvtV2pi6QZiH1KaoqO5BdvJ2fBMiNAONHQTF3P1vcw94u"}
      }],
      expanded: {},
      visible: true,
      /*replyData: [],*/
    }
  },
  methods: {
    expandReplay(userId, commentId) {
      // 表示已经打开了
      this.expanded[commentId] = "show";
      // this.$set(this.expanded, commentId, "hide");
      this.replyData[commentId] = this[commentId];
      this.$forceUpdate();
      console.log(this.replyData[commentId]);
      // this.visible = false;

    },
    packUpReplay(commentId) {
      this.expanded[commentId] = "hide";
      this.replyData[commentId] = [];
      this.$forceUpdate();
      // 如果是object或者是array类型的话改变值最好用this.$set()、this.$delete(),array.splice()等方法进行修改

      // this.$set(this.data,'tabDefault',false)

      // this.$set(this.expanded, commentId, "show");

    },
  }
}
</script>

<style scoped>

.cmt-detail--1CVzS {
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  text-align: initial;
  -moz-box-pack: start;
  -ms-flex-pack: start;
  justify-content: flex-start;
  -ms-flex-line-pack: center;
  align-content: center;
  -moz-box-orient: vertical;
  -moz-box-direction: normal;
  -ms-flex-direction: column;
  flex-direction: column;
  -moz-box-flex: 1;
  -ms-flex: 1 1;
  flex: 1 1;
}

.cmt-detail--1CVzS .cmt-title--32XL- {
  font-size: 18px;
  font-weight: 600;
  margin: 16px 0 24px;
}

.cmt-ul--2wBky {
  -moz-box-flex: 1;
  -ms-flex: 1 1;
  flex: 1 1;
  min-height: 18px;
  list-style: none;
  padding-left: 0;
}

.cmt-ul--2wBky .cmt-li--1ncVr {
  position: relative;
  padding: 24px 0 17px 60px;
}

.cmt-ul--2wBky .cmt-li--1ncVr .cmt-item--2D1l_>.cmt-avatar--K05gm {
  top: 24px;
}

.cmt-avatar--K05gm {
  width: 40px;
  height: 40px;
  position: absolute;
  top: 0;
  left: 12px;
  border-radius: 50%;
}

.cmt-content--1rC9R .cmt-name--C-CRF {
  font-size: 14px;
  line-height: 20px;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  -moz-box-align: center;
  -ms-flex-align: center;
  align-items: center;
  margin: 0;
}

.cmt-content--1rC9R .cmt-time--1eLnF {
  text-align: initial;
  font-size: 12px;
  margin: 0 0 3px;
  line-height: 20px;
  color: rgba(28,31,35,0.6);
}

.cmt-text--2uo7G {
  line-height: 20px;
  min-height: 20px;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  -moz-box-align: center;
  -ms-flex-align: center;
  align-items: center;
  word-break: break-word;
  font-size: 14px;
  margin-bottom: 12px;
  font-family: inherit;
}

.cmt-text--2uo7G em {
  color: rgba(28,31,35,0.6);
  margin: 0 5px;
}

.cmt-content--1rC9R .cmt-icons--1rKXh {
  margin: -4px 0 0;
  height: 17px;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  -moz-box-align: center;
  -ms-flex-align: center;
  align-items: center;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

.cmt-content--1rC9R .cmt-icons--1rKXh span {
  margin-right: 24px;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  -moz-box-align: center;
  -ms-flex-align: center;
  align-items: center;
  font-size: 12px;
  color: rgba(28,31,35,0.6);
  cursor: pointer;
}

.cmt-content--1rC9R .cmt-icons--1rKXh span svg {
  margin-right: 5px;
}

.cmt-item--2D1l_ .cmt-expand--16Cbs:hover {
  opacity: .8;
}

.cmt-item--2D1l_ .cmt-expand--16Cbs {
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  -moz-box-align: center;
  -ms-flex-align: center;
  align-items: center;
  margin-top: 8px;
  cursor: pointer;
  font-size: 12px;
  position: relative;
  /*width: -webkit-fit-content;*/
  width: -moz-fit-content;
  width: fit-content;
  color: rgba(28,31,35,0.6);
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

.cmt-item--2D1l_ .cmt-expand--16Cbs span {
  width: 32px;
  height: 1px;
  display: inline-block;
  margin-right: 4px;
  background: rgba(22,24,35,0.06);
}

.cmt-item--2D1l_ .cmt-expand--16Cbs svg {
  color: #bbbcbd;
  margin-left: 6px;
}

.semi-icons-default {
  width: 16px;
  height: 16px;
}

.semi-icons {
  fill: currentColor;
}

.cmt-ul--2wBky .cmt-li--1ncVr.sub--bIN9u {
  padding: 11px 0 10px 38px;
}

.cmt-ul--2wBky .cmt-li--1ncVr {
  position: relative;
  padding: 24px 0 17px 60px;
}

.cmt-ul--2wBky .cmt-li--1ncVr.sub--bIN9u .cmt-item--2D1l_>.cmt-avatar--K05gm {
  top: 14px;
}

.cmt-item--2D1l_.sub--bIN9u .cmt-avatar--K05gm {
  width: 32px;
  height: 32px;
  left: 0;
}
.cmt-content--1rC9R .cmt-label--3epN8.red--1p5xw {
  background: rgba(254, 44, 85, 1);
  color: white;
}

.cmt-content--1rC9R .cmt-label--3epN8 {
  min-width: 34px;
  height: 17px;
  padding: 0 5px;
  background: rgba(22,24,35,0.05);
  color: rgba(22,24,35,0.5);
  border-radius: 2px;
  margin-left: 5px;
  font-size: 12px;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  -moz-box-pack: center;
  -ms-flex-pack: center;
  justify-content: center;
  -moz-box-align: center;
  -ms-flex-align: center;
  align-items: center;
  -webkit-transform: scale(0.83);
  -moz-transform: scale(0.83);
  transform: scale(0.83);
}

.cmt-ul--2wBky.sub--bIN9u {
  padding-top: 15px;
}

</style>