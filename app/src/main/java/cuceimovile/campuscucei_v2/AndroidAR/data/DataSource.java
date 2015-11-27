package cuceimovile.campuscucei_v2.AndroidAR.data;

import java.util.List;

import cuceimovile.campuscucei_v2.AndroidAR.ui.Marker;

/**
 * This abstract class should be extended for new data sources.
 * 
 * @author Justin Wetherell <phishman3579@gmail.com>
 */
public abstract class DataSource {

    public abstract List<Marker> getMarkers();
}
