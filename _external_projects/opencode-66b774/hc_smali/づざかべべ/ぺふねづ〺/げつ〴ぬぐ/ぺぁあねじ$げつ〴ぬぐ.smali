.class public Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$げつ〴ぬぐ;
.super Lづざかべべ/げつ〴ぬぐ/〺つふすそ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;


# direct methods
.method public constructor <init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;Z)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    invoke-direct {p0, p2}, Lづざかべべ/げつ〴ぬぐ/〺つふすそ;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    .line 1
    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ばおぢでぎか()Z

    iget-object v1, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->てぜきぽく:Lづざかべべ/げつ〴ぬぐ/〺つふすそ;

    .line 2
    iget-boolean v1, v1, Lづざかべべ/げつ〴ぬぐ/〺つふすそ;->げつ〴ぬぐ:Z

    if-eqz v1, :cond_f

    .line 3
    invoke-virtual {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->びぐびあび()Z

    goto :goto_14

    :cond_f
    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->ぺふねづ〺:Landroidx/activity/OnBackPressedDispatcher;

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->げつ〴ぬぐ()V

    :goto_14
    return-void
.end method
