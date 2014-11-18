console.profile('Chordials CPU profiler');

var extName = chrome.i18n.getMessage("extName");

console.groupCollapsed(extName + ': initialization');
console.time('Total time spent');

/*
* TODO Connect to VK API
* TODO Get audios
* TODO ChAPI queries
 */

console.timeEnd('Total time spent');
console.groupEnd();

console.profileEnd('Chordials CPU profiler');
