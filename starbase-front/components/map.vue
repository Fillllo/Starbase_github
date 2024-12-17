<template>
  <div style="width: 100%; height:100%" class="d-flex">
    <v-navigation-drawer v-model="isShow" class="background-black text-white" style="position: absolute;">
      <SitesInfos :site="siteNom" @close-tab="closeTab()"/>
    </v-navigation-drawer>

    <GoogleMap
    api-key="AIzaSyCAFZt2q344l0arR2wV3uig8Vjq7ozCj4w"
    style="width: 100%; height:100%"
    :center="center"
    :zoom="13"
    :disableDefaultUi="true"
    map-id="satellite"
    >
      <Marker @click="showSite(site)" v-for="site in sites" :key="site.id" 
      :options="{ 
        position: {lat: Number(site.latitude), lng: Number(site.longitude)},
        icon: {
          url: getIcon(site.name),
          scaledSize: {width: 60, height: 60},
        } 
      }" />
    </GoogleMap>
  </div>
</template>

<script lang="ts" setup>
import { GoogleMap, Marker } from 'vue3-google-map'
import { useSitesStore } from '@/stores/sites'
import SitesInfos from '@/components/infosSite.vue'
import type { Site } from '@/types'

const siteStore = useSitesStore()
await siteStore.fetchSites()

const sites = ref<Site[]>(siteStore.getSites());
console.log(siteStore.getSites())

const getIcon = (name) => {
  if(name === 'HIGHBAY') return 'HIGHBAY.png';
  if(name === 'MEGABAY') return 'MEGABAY.png';
  return;
}
const center = { lat: 25.958992, lng: -97.2204573 }

const isShow = ref(false)
const siteNom = ref('')

const showSite = (site) => {
  isShow.value = true
  siteNom.value = site
}

const closeTab = () => {
  isShow.value = false
}
</script>

<style>

</style>