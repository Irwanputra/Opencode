.class public Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/support/v4/media/MediaBrowserCompat$くし〴〺ぅ;
.implements Landroid/support/v4/media/MediaBrowserCompat$〳ぜぞぜべっ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/media/MediaBrowserCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3041\u3054\u3050\u3059\u3059\u3043"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

.field public final 〺つふすそ:Landroid/content/ComponentName;

.field public ぁごぐすすぃ:I

.field public いいにぽつ:Landroid/os/Messenger;

.field public final くし〴〺ぅ:Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;

.field public final げつ〴ぬぐ:Landroid/content/Context;

.field public final づざかべべ:Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;

.field public てぜきぽく:Landroid/support/v4/media/session/MediaSessionCompat$Token;

.field public final なぎぱいぢぎ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050<",
            "Ljava/lang/String;",
            "Landroid/support/v4/media/MediaBrowserCompat$\u3044\u3044\u306b\u307d\u3064;",
            ">;"
        }
    .end annotation
.end field

.field public final びぐびあび:Landroid/os/Bundle;

.field public ぺぁあねじ:Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;

.field public ぺふねづ〺:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;Landroid/os/Bundle;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;-><init>(Landroid/support/v4/media/MediaBrowserCompat$〳ぜぞぜべっ;)V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->づざかべべ:Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;

    new-instance v0, Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-direct {v0}, Lづざかべべ/づざかべべ/げつ〴ぬぐ;-><init>()V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    const/4 v0, 0x1

    iput v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    if-eqz p1, :cond_3c

    if-eqz p2, :cond_34

    if-eqz p3, :cond_2c

    iput-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/content/Context;

    iput-object p2, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〺つふすそ:Landroid/content/ComponentName;

    iput-object p3, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->くし〴〺ぅ:Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;

    if-nez p4, :cond_24

    const/4 p1, 0x0

    goto :goto_29

    :cond_24
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1, p4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    :goto_29
    iput-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->びぐびあび:Landroid/os/Bundle;

    return-void

    :cond_2c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "connection callback must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_34
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "service component must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "context must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ぺぁあねじ(I)Ljava/lang/String;
    .registers 2

    if-eqz p0, :cond_21

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1e

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1b

    const/4 v0, 0x3

    if-eq p0, v0, :cond_18

    const/4 v0, 0x4

    if-eq p0, v0, :cond_15

    const-string v0, "UNKNOWN/"

    invoke-static {v0, p0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_15
    const-string p0, "CONNECT_STATE_SUSPENDED"

    return-object p0

    :cond_18
    const-string p0, "CONNECT_STATE_CONNECTED"

    return-object p0

    :cond_1b
    const-string p0, "CONNECT_STATE_CONNECTING"

    return-object p0

    :cond_1e
    const-string p0, "CONNECT_STATE_DISCONNECTED"

    return-object p0

    :cond_21
    const-string p0, "CONNECT_STATE_DISCONNECTING"

    return-object p0
.end method


# virtual methods
.method public 〳ぜぞぜべっ()V
    .registers 3

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〳ぜぞぜべっ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    if-eqz v0, :cond_9

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->げつ〴ぬぐ:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    :cond_9
    const/4 v0, 0x1

    iput v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〳ぜぞぜべっ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぺぁあねじ:Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->いいにぽつ:Landroid/os/Messenger;

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->づざかべべ:Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;

    invoke-virtual {v1, v0}, Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/os/Messenger;)V

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぺふねづ〺:Ljava/lang/String;

    iput-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->てぜきぽく:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    return-void
.end method

.method public 〺つふすそ()Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .registers 4

    .line 1
    iget v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_7

    const/4 v0, 0x1

    goto :goto_8

    :cond_7
    const/4 v0, 0x0

    :goto_8
    if-eqz v0, :cond_d

    .line 2
    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->てぜきぽく:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    return-object v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getSessionToken() called while not connected(state="

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ぁごぐすすぃ()V
    .registers 3

    const-string v0, "  mServiceComponent="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〺つふすそ:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  mCallback="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->くし〴〺ぅ:Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  mRootHints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->びぐびあび:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    iget v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    invoke-static {v0}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぺぁあねじ(I)Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  mServiceConnection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〳ぜぞぜべっ:Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$くし〴〺ぅ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  mServiceBinderWrapper="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぺぁあねじ:Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  mCallbacksMessenger="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->いいにぽつ:Landroid/os/Messenger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  mMediaSessionToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->てぜきぽく:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    return-void
.end method

.method public final いいにぽつ(Landroid/os/Messenger;Ljava/lang/String;)Z
    .registers 5

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->いいにぽつ:Landroid/os/Messenger;

    const/4 v1, 0x1

    if-ne v0, p1, :cond_d

    iget p1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    if-eqz p1, :cond_d

    if-ne p1, v1, :cond_c

    goto :goto_d

    :cond_c
    return v1

    :cond_d
    :goto_d
    iget p1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    if-eqz p1, :cond_33

    if-eq p1, v1, :cond_33

    const-string p1, " for "

    invoke-static {p2, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object p2, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〺つふすそ:Landroid/content/ComponentName;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " with mCallbacksMessenger="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->いいにぽつ:Landroid/os/Messenger;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " this="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    :cond_33
    const/4 p1, 0x0

    return p1
.end method

.method public くし〴〺ぅ(Landroid/os/Messenger;Ljava/lang/String;Landroid/support/v4/media/session/MediaSessionCompat$Token;Landroid/os/Bundle;)V
    .registers 13

    const-string p4, "onConnect"

    invoke-virtual {p0, p1, p4}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->いいにぽつ(Landroid/os/Messenger;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_9

    return-void

    :cond_9
    iget p1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    const/4 p4, 0x2

    if-eq p1, p4, :cond_12

    invoke-static {p1}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぺぁあねじ(I)Ljava/lang/String;

    return-void

    :cond_12
    iput-object p2, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぺふねづ〺:Ljava/lang/String;

    iput-object p3, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->てぜきぽく:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    const/4 p1, 0x3

    iput p1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    sget-boolean p2, Landroid/support/v4/media/MediaBrowserCompat;->〺つふすそ:Z

    if-eqz p2, :cond_20

    invoke-virtual {p0}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ()V

    :cond_20
    iget-object p2, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->くし〴〺ぅ:Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;

    invoke-virtual {p2}, Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;->げつ〴ぬぐ()V

    :try_start_25
    iget-object p2, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {p2}, Lづざかべべ/づざかべべ/げつ〴ぬぐ;->entrySet()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Lづざかべべ/づざかべべ/ぁごぐすすぃ$〺つふすそ;

    invoke-virtual {p2}, Lづざかべべ/づざかべべ/ぁごぐすすぃ$〺つふすそ;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_31
    move-object p3, p2

    check-cast p3, Lづざかべべ/づざかべべ/ぁごぐすすぃ$びぐびあび;

    invoke-virtual {p3}, Lづざかべべ/づざかべべ/ぁごぐすすぃ$びぐびあび;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_83

    invoke-virtual {p3}, Lづざかべべ/づざかべべ/ぁごぐすすぃ$びぐびあび;->next()Ljava/lang/Object;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/support/v4/media/MediaBrowserCompat$いいにぽつ;

    .line 1
    iget-object v0, p3, Landroid/support/v4/media/MediaBrowserCompat$いいにぽつ;->げつ〴ぬぐ:Ljava/util/List;

    .line 2
    iget-object p3, p3, Landroid/support/v4/media/MediaBrowserCompat$いいにぽつ;->〺つふすそ:Ljava/util/List;

    const/4 v1, 0x0

    .line 3
    :goto_4e
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_31

    iget-object v2, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぺぁあねじ:Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/support/v4/media/MediaBrowserCompat$ぺふねづ〺;

    iget-object v3, v3, Landroid/support/v4/media/MediaBrowserCompat$ぺふねづ〺;->げつ〴ぬぐ:Landroid/os/IBinder;

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Bundle;

    iget-object v5, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->いいにぽつ:Landroid/os/Messenger;

    .line 4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    const-string v7, "data_media_item_id"

    invoke-virtual {v6, v7, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "data_callback_token"

    invoke-static {v6, v7, v3}, Lづざかべべ/〳ぜぞぜべっ/づざかべべ/なぎぱいぢぎ;->〺つふすそ(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/IBinder;)V

    const-string v3, "data_options"

    invoke-virtual {v6, v3, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v2, p1, v6, v5}, Landroid/support/v4/media/MediaBrowserCompat$ぺぁあねじ;->げつ〴ぬぐ(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    :try_end_80
    .catch Landroid/os/RemoteException; {:try_start_25 .. :try_end_80} :catch_83

    add-int/lit8 v1, v1, 0x1

    goto :goto_4e

    :catch_83
    :cond_83
    return-void
.end method

.method public げつ〴ぬぐ(Landroid/os/Messenger;)V
    .registers 4

    const-string v0, "onConnectFailed for "

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〺つふすそ:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    const-string v0, "onConnectFailed"

    invoke-virtual {p0, p1, v0}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->いいにぽつ(Landroid/os/Messenger;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_17

    return-void

    :cond_17
    iget p1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_20

    invoke-static {p1}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぺぁあねじ(I)Ljava/lang/String;

    return-void

    :cond_20
    invoke-virtual {p0}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〳ぜぞぜべっ()V

    iget-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->くし〴〺ぅ:Landroid/support/v4/media/MediaBrowserCompat$〺つふすそ;

    check-cast p1, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;

    .line 1
    invoke-virtual {p1}, Landroidx/media/session/MediaButtonReceiver$げつ〴ぬぐ;->〺つふすそ()V

    return-void
.end method

.method public づざかべべ()V
    .registers 3

    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->づざかべべ:Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;

    new-instance v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$〺つふすそ;

    invoke-direct {v1, p0}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$〺つふすそ;-><init>(Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public なぎぱいぢぎ()V
    .registers 4

    iget v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    if-eqz v0, :cond_26

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    goto :goto_26

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "connect() called while neigther disconnecting nor disconnected (state="

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    invoke-static {v2}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぺぁあねじ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_26
    :goto_26
    const/4 v0, 0x2

    iput v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->ぁごぐすすぃ:I

    iget-object v0, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->づざかべべ:Landroid/support/v4/media/MediaBrowserCompat$げつ〴ぬぐ;

    new-instance v1, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$げつ〴ぬぐ;

    invoke-direct {v1, p0}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ$げつ〴ぬぐ;-><init>(Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public びぐびあび(Landroid/os/Messenger;Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .registers 6

    const-string p3, "onLoadChildren"

    invoke-virtual {p0, p1, p3}, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->いいにぽつ(Landroid/os/Messenger;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_9

    return-void

    :cond_9
    sget-boolean p1, Landroid/support/v4/media/MediaBrowserCompat;->〺つふすそ:Z

    if-eqz p1, :cond_23

    const-string p1, "onLoadChildren for "

    invoke-static {p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object p3, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->〺つふすそ:Landroid/content/ComponentName;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " id="

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    :cond_23
    iget-object p1, p0, Landroid/support/v4/media/MediaBrowserCompat$ぁごぐすすぃ;->なぎぱいぢぎ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    const/4 p3, 0x0

    .line 1
    invoke-virtual {p1, p2, p3}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 2
    check-cast p1, Landroid/support/v4/media/MediaBrowserCompat$いいにぽつ;

    if-nez p1, :cond_2f

    return-void

    :cond_2f
    invoke-virtual {p1, p4}, Landroid/support/v4/media/MediaBrowserCompat$いいにぽつ;->げつ〴ぬぐ(Landroid/os/Bundle;)Landroid/support/v4/media/MediaBrowserCompat$ぺふねづ〺;

    return-void
.end method
