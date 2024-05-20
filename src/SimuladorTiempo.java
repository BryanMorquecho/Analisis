public class SimuladorTiempo {

    public static void main(String[] args) {
        int[][] testDataSizes = { { 10 }, { 20 }, { 100 }, { 1000 }, { 5000 }, { 10000 }, { 30000 } };
        String[] sortingMethods = { "Burbuja con Ajustes", "Selección", "Inserción" };

        for (String sortingMethod : sortingMethods) {
            System.out.println("Método " + sortingMethod);

            for (int[] testDataSize : testDataSizes) {
                int dataSize = testDataSize[0];
                int[] data = generateRandomArray(dataSize);

                long startTime = System.nanoTime();

                switch (sortingMethod) {
                    case "Burbuja con Ajustes":
                        bubbleSort(data.clone());
                        break;
                    case "Selección":
                        selectionSort(data.clone());
                        break;
                    case "Inserción":
                        insertionSort(data.clone());
                        break;
                    default:
                        System.out.println("Método no válido");
                        break;
                }

                long endTime = System.nanoTime();
                long duration = (endTime - startTime) / 1000; // Convertir a segundos
                System.out.println("Con " + dataSize + " valores el tiempo es de " + duration + " seg.");
            }

            System.out.println();
        }
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 1000); // Ajustar rango según sea necesario
        }
        return array;
    }

    private static void bubbleSort(int[] array) {
        // Implementación del algoritmo de Burbuja con Ajustes
    }

    private static void selectionSort(int[] array) {
        // Implementación del algoritmo de Selección
    }

    private static void insertionSort(int[] array) {
        // Implementación del algoritmo de Inserción
    }
}