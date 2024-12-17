<template>
  <v-list>
    <div class="d-flex justify-end mr-2">
      <v-btn icon density="compact" color="black" @click="$emit('closeTab')">
        <v-icon>mdi-close</v-icon>
     </v-btn>
    </div>
    <div class="pt-3 pl-2" style="font-weight: 600; font-size:25px; letter-spacing:2px">
      {{ site.name }} {{ site.code }}
    </div>
    <v-divider horizontal color="white" :thickness="3" class="border-opacity-100 mr-4"></v-divider>
    <div class="mt-3">
      <div v-if="site.ships?.length > 0">
        <b class="ml-1 color-grey" style="letter-spacing:1px">SHIPS</b> 
        <div class="pt-2">
          <v-hover v-for="ship in site.ships" :key="ship.id" v-slot="{ isHovering, props }">
            <v-card class=" mx-2 mb-3 actif d-flex flex-column" style="" v-bind="props" @click="goToActif(ship.id, 'ship')">
              <b class="pl-2 font-size-20" style="letter-spacing:1px; font-weight:600">{{ ship.name }}</b>
              <v-divider horizontal color="white" :thickness="1" class="border-opacity-100 mr-8"></v-divider>
              <div class="d-flex justify-space-around mt-2">
                <div class="d-flex flex-column align-center">
                  <v-icon color="#afe1ff">mdi-snowflake</v-icon>
                  <span>2</span>
                </div>
                <div class="d-flex flex-column align-center">
                  <v-icon>mdi-weather-windy</v-icon>
                  <span>2</span>
                </div>
                <div class="d-flex flex-column align-center">
                  <v-icon color="#e95909">mdi-fire</v-icon>
                  <span>2</span>
                </div>
              </div>
              <v-slide-x-reverse-transition>
                <div
                  v-if="isHovering"
                  class="d-flex plus-infos"
                  style="height: 100%; width:100px"
                >
                  <div class="d-flex justify-end align-center" style="width: 100%;">
                    <v-icon size="30"class="font-size-20 mr-3">mdi-arrow-right-thin-circle-outline</v-icon>
                  </div>
                </div>
              </v-slide-x-reverse-transition>
            </v-card>
          </v-hover>
        </div>
        
      </div>
      <div v-if="site.boosters?.length > 0">
        <b class="ml-1 color-grey" style="letter-spacing:1px">BOOSTERS</b>  
        <div class="pt-2">
          <v-hover v-for="booster in site.boosters" :key="booster.id" v-slot="{ isHovering, props }">
            <v-card class=" mx-2 mb-3 actif d-flex flex-column" style="" v-bind="props" @click="goToActif(booster.id, 'booster')">
              <b class="pl-2 font-size-20" style="letter-spacing:1px; font-weight:600">{{ booster.name }}</b>
              <v-divider horizontal color="white" :thickness="1" class="border-opacity-100 mr-8"></v-divider>
              <div class="d-flex justify-space-around mt-2">
                <div class="d-flex flex-column align-center">
                  <v-icon color="#afe1ff">mdi-snowflake</v-icon>
                  <span>2</span>
                </div>
                <div class="d-flex flex-column align-center">
                  <v-icon>mdi-weather-windy</v-icon>
                  <span>2</span>
                </div>
                <div class="d-flex flex-column align-center">
                  <v-icon color="#e95909">mdi-fire</v-icon>
                  <span>2</span>
                </div>
              </div>
              <v-slide-x-reverse-transition>
                <div
                  v-if="isHovering"
                  class="d-flex plus-infos"
                  style="height: 100%; width:100px"
                >
                  <div class="d-flex justify-end align-center" style="width: 100%;">
                    <v-icon size="30"class="font-size-20 mr-3">mdi-arrow-right-thin-circle-outline</v-icon>
                  </div>
                </div>
              </v-slide-x-reverse-transition>
            </v-card>
          </v-hover>
        </div>
      </div>
      <div v-if="site.boosters?.length === 0 && site.ships?.length === 0" class="mx-2 text-center color-grey font-weight-bold">Aucun actif n'est présent sur ce site</div>
    </div>
  </v-list>
</template>

<script lang="ts" setup>
import type { Site } from '~/types';

const props = defineProps<{
  site: Site
}>()

const goToActif = (id: string, type: string) => {
  console.log("test")
  navigateTo( {
    path: '/actif',
    query : {
      id: id,
      type: type
    }
  })
}
</script>

<style scoped>
.actif {
  background-color: #151515;
  color: white;
}

.actif:hover {
  background-color: #1f1f1f;
  cursor: pointer;
}

.plus-infos {
  position: absolute;
  right: 0;
  background: rgb(0,0,0);
  background: linear-gradient(270deg, rgba(0,0,0,0.8736226912640056) 31%, rgba(0,0,0,0) 100%);
}
</style>