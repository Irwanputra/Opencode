.class public Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;


# direct methods
.method public constructor <init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;

    iget-object v1, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->〴ねぷぐくぼ:Landroid/app/Dialog;

    if-eqz v1, :cond_9

    invoke-virtual {v0, v1}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/〺つふすそ;->onDismiss(Landroid/content/DialogInterface;)V

    :cond_9
    return-void
.end method
