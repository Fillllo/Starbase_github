<template>
  <div class="actif_infos">
    <infosShip v-if="type === 'ship'"/>
    <infosBooster v-if="type === 'booster'"/>
  </div>
</template>
<script lang="ts" setup>
import infosShip from '@/components/infosShip.vue'
import infosBooster from '@/components/infosBooster.vue'

const route = useRoute();
const type = ref<string>(route.query.type);
</script>
<style scoped>
.actif_infos {
  background-color: #151515;
  color: white;
  height: 100%;
}
</style>
