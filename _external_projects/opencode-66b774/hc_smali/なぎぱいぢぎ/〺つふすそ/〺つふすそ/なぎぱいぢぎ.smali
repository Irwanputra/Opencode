.class public Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static づざかべべ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;


# instance fields
.field public 〺つふすそ:I

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;

.field public びぐびあび:I


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;->なぎぱいぢぎ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;

    iput-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;

    const/4 v0, 0x0

    iput v0, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->〺つふすそ:I

    iput v0, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->くし〴〺ぅ:I

    iput v0, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->びぐびあび:I

    return-void
.end method

.method public static げつ〴ぬぐ()Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;
    .registers 2

    sget-object v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->づざかべべ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;

    if-nez v0, :cond_17

    const-class v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;

    monitor-enter v0

    :try_start_7
    sget-object v1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->づざかべべ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;

    if-nez v1, :cond_12

    new-instance v1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;

    invoke-direct {v1}, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;-><init>()V

    sput-object v1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->づざかべべ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;

    :cond_12
    monitor-exit v0

    goto :goto_17

    :catchall_14
    move-exception v1

    monitor-exit v0
    :try_end_16
    .catchall {:try_start_7 .. :try_end_16} :catchall_14

    throw v1

    :cond_17
    :goto_17
    sget-object v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->づざかべべ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized 〺つふすそ(JJ)V
    .registers 9

    sget-object v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;->なぎぱいぢぎ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;

    monitor-enter p0

    const-wide/16 v1, 0x0

    cmp-long v3, p3, v1

    if-eqz v3, :cond_7d

    const-wide/16 v1, 0x4e20

    cmp-long v3, p1, v1

    if-ltz v3, :cond_7d

    long-to-double p1, p1

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p1, p1, v1

    long-to-double p3, p3

    invoke-static {p3, p4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p1, p3

    const-wide/high16 p3, 0x4020000000000000L    # 8.0

    mul-double p1, p1, p3

    const-wide/high16 p3, 0x4024000000000000L    # 10.0

    cmpg-double v1, p1, p3

    if-gez v1, :cond_27

    goto :goto_7d

    :cond_27
    :try_start_27
    iget p3, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->〺つふすそ:I

    iget p4, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->くし〴〺ぅ:I
    :try_end_2b
    .catchall {:try_start_27 .. :try_end_2b} :catchall_7a

    mul-int p3, p3, p4

    int-to-double v1, p3

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v1, p1

    add-int/lit8 p1, p4, 0x1

    int-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v1, p1

    double-to-int p1, v1

    :try_start_3a
    iput p1, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->〺つふすそ:I

    add-int/lit8 p4, p4, 0x1

    iput p4, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->くし〴〺ぅ:I

    const/4 p2, 0x5

    if-eq p4, p2, :cond_4a

    iget-object p3, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;

    if-ne p3, v0, :cond_78

    const/4 p3, 0x2

    if-ne p4, p3, :cond_78

    :cond_4a
    iget-object p3, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;

    iput p1, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->びぐびあび:I

    if-gtz p1, :cond_53

    iput-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;

    goto :goto_6f

    :cond_53
    const/16 v0, 0x96

    if-ge p1, v0, :cond_5c

    sget-object p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;

    :goto_59
    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;

    goto :goto_6f

    :cond_5c
    const/16 v0, 0x226

    if-ge p1, v0, :cond_63

    sget-object p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;->くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;

    goto :goto_59

    :cond_63
    const/16 v0, 0x7d0

    if-ge p1, v0, :cond_6a

    sget-object p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;->びぐびあび:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;

    goto :goto_59

    :cond_6a
    if-le p1, v0, :cond_6f

    sget-object p1, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;->づざかべべ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;

    goto :goto_59

    :cond_6f
    :goto_6f
    if-ne p4, p2, :cond_76

    const/4 p1, 0x0

    iput p1, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->〺つふすそ:I

    iput p1, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->くし〴〺ぅ:I

    :cond_76
    iget-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/ぁごぐすすぃ;
    :try_end_78
    .catchall {:try_start_3a .. :try_end_78} :catchall_7a

    :cond_78
    monitor-exit p0

    return-void

    :catchall_7a
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_7d
    :goto_7d
    monitor-exit p0

    return-void
.end method
