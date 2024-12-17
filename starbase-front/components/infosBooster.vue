<template>
  <div class="d-flex justify-space-around" style="height: 100%;">
    <div v-if="!isMobile" class="ship_container d-flex align-center justify-center my-auto">
      <div class="ship_shadow"></div>
      <v-img id="ship" src="/public/booster.png" alt="ship" width="100%" max-width="300"/>
    </div>
    <div style="width: 100%;" class="d-flex flex-column mt-4 pr-3">
      <div class="d-flex flex-column" style="letter-spacing: 1px;" :class="{'ml-2':isMobile}">
        <b style="font-size:60px; line-height: 70px">B11</b>
        <span class="d-flex ml-1 mb-1">MEGABAY 2</span>
      </div>
      <v-divider horizontal color="white" :thickness="3" class="border-opacity-100"></v-divider>
      <v-card class="infos mx-auto mt-5 pb-3" width="100%" max-width="80%" >
        <div class="color-light-grey ml-2 mt-1">
          <b class="letter-spacing-1">TESTS</b>
        </div>
        <div class="d-flex justify-space-around mt-2">
          <div class="d-flex flex-column align-center">
            <v-icon color="#afe1ff">mdi-snowflake</v-icon>
            <b class="font-size-20">2</b>
          </div>
          <div class="d-flex flex-column align-center">
            <v-icon>mdi-weather-windy</v-icon>
            <b class="font-size-20">2</b>
          </div>
          <div class="d-flex flex-column align-center">
            <v-icon color="#e95909">mdi-fire</v-icon>
            <b class="font-size-20">2</b>
          </div>
        </div>
      </v-card>
      <v-card class="infos mx-auto mt-5 pb-3" width="100%" max-width="80%">
        <div class="color-light-grey ml-2 mt-1">
          <b class="letter-spacing-1">STATISTIQUES</b>
        </div>
        <div class="d-flex justify-space-around letter-spacing-1 mt-2">
          <div class="d-flex flex-column align-center">
            <b>LIFTS</b>
            <b class="font-size-20">2</b>
          </div>
          <div class="d-flex flex-column align-center">
            <b>FS</b>
            <b class="font-size-20">2</b>
          </div>
          <div class="d-flex flex-column align-center">
            <b>WDR</b>
            <b class="font-size-20">2</b>
          </div>
        </div>
      </v-card>
      <div v-if="isMobile" class="ship_container d-flex align-center justify-center my-auto mt-5">
        <div class="ship_shadow"></div>
        <v-img id="ship" src="/public/booster.png" alt="ship" width="100%" max-width="300"/>
      </div>
      <!-- <v-card class="infos mx-4 mt-5" max-width="80%" height="70px">
        <div class="color-light-grey ml-2 mt-1">
          <b class="letter-spacing-1">VOLS</b>
        </div>
        <div class="d-flex justify-space-around">
          <div class="d-flex flex-column align-center">
            <b>Lifts par Mechazilla</b>
            <b class="font-size-20">2</b>
          </div>
          <div class="d-flex flex-column align-center">
            <b>Full Stacks</b>
            <b class="font-size-20">2</b>
          </div>
          <div class="d-flex flex-column align-center">
            <b>WDR</b>
            <b class="font-size-20">2</b>
          </div>
        </div>
      </v-card> -->
    </div>
  </div>
</template>

<script lang="ts" setup>
 const { name } = useDisplay()
const isMobile = computed(() => {
  return name.value === 'xs'
})
</script>

<style scoped>
.ship_container {
  position: relative;
  width: 100%;
  height: 100%;
  height: fit-content;
}
.ship_shadow {
  position: absolute;
  width: 100%;
  max-width: 300px;
  height: 100%;
  z-index: 10;
  box-shadow: inset 0 0 50px 50px #151515;
}
.infos {
  background-color: #2b2b2b;
  color: white;
}
</style>